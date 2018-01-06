import sun.misc.IOUtils;

import java.io.*;
import java.util.Scanner;

public class Test {

    static boolean isRunning = true;

    public static void main (String Args[]) throws IOException {

        CreateFileIfNeeded cf = new CreateFileIfNeeded("hola");
        ScaningClass sc = new ScaningClass();
        isRunning=sc.MenuOrExit();

        while (isRunning == true) {

           String name = sc.TakeMemberName();
           int age = sc.TakeMemberAge();
           cf.AddPlayer(name, age);
            isRunning=sc.MenuOrExit();

        }

        cf.CreateAndCopyNewCsvFile("hola2","hola");

//        cf.RemoveText("tomek","hola");

    }








}
