import java.io.*;

public class CreateFileIfNeeded {

    // a może by zainicjalizować te buffered writery i readery w bloku na początku i referencję zrobić publiczną

    String filename;
    final String coma = ";";

//            BufferedWriter bw = new BufferedWriter();


    public CreateFileIfNeeded(String filename) {
        this.filename = filename;

        File file = new File("E:\\java\\" + filename + ".csv");

        System.out.println(file.exists());

        if (file.exists() == false) {
            System.out.println(file.exists());
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void AddPlayer(String player, int age) {
        try {
            File file = new File("E:\\java\\" + filename + ".csv");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw);
            Player p = new Player(player, age);
            br.write(p.getName()+coma+p.getAge());

            br.newLine();


            br.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void RemoveText(String textToRemove, String fileName){
        File inputFile = new File("E:\\java\\"+fileName+".csv");
        File tempFile = new File("E:\\java\\"+"temp"+".csv");

        try {
            tempFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        File tempFile = new File("myTempFile.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(tempFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String lineToRemove = "tomek;25";
        String currentLine;

        try {
            while((currentLine = reader.readLine()) != null) {
//                System.out.println(currentLine);
//                writer.write("tygygjhjh");
                if(currentLine.equals(lineToRemove)){
                    continue;
                }
                else
                    writer.write(currentLine);
                    writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        tempFile.renameTo(inputFile);
        inputFile.delete();

        try {
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void ChangeFileName(String filename, String newNama){
        File file = new File("E:\\java\\" + filename + ".csv");
        File newfile = new File("E:\\java\\" + "herby" + ".csv");
        file.renameTo(newfile);

    }

    public void CreateAndCopyNewCsvFile(String newCsvFileName, String nameOfOldFile) throws IOException {
        File newFile = new File("E:\\java\\" + newCsvFileName + ".csv");
        File oldFile = new File("E:\\java\\" + nameOfOldFile + ".csv");
        newFile.createNewFile();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(oldFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));

        String lineOfOldFile = bufferedReader.readLine();


        while (lineOfOldFile!=null){


            if (lineOfOldFile.equals("tomek")){
                lineOfOldFile = bufferedReader.readLine();
            }
            bufferedWriter.write(lineOfOldFile);
            bufferedWriter.newLine();
            lineOfOldFile = bufferedReader.readLine();
        }

        bufferedWriter.flush();
    }


}
