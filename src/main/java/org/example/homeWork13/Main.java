package org.example.homeWork13;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("text.txt");//ex1
        writer.write(" Hello world\n");
        writer.flush();

        //ex2
        String line1;
        FileReader file1 = new FileReader("text.txt");
        BufferedReader br1 = new BufferedReader(file1);
        line1= br1.readLine();
        if(line1.trim().equals("Hello world")){
            String str=new String("World Hello");
            writer.write(new String("World Hello") );
            System.out.println("drfgfdg");
        }

        writer.flush();


////ex3
//        String line1;
//        int count1 = 0;
//        FileReader file1 = new FileReader("text.txt");
//        BufferedReader br1 = new BufferedReader(file1);
//        while ((line1 = br1.readLine()) != null) {
//            String[] words = line1.split(" ");
//            for (String word : words) {
//                int j = word.length();
//                count1 += j;
//            }
//        }
//        System.out.println("Nisheri qankay=" + count1);
//        br1.close();
////ex4
//        String line;
//        int count = 0;
//        FileReader file = new FileReader("text.txt");
//        BufferedReader br = new BufferedReader(file);
//        while ((line = br.readLine()) != null) {
//            String[] words = line.split(" ");
//            count += words.length;
//        }
//        System.out.println("bareri qankay=" + count);
//        br.close();

        //ex5
//        String str="Poghosyan";
//        writer.write("Hello "+str);
//        writer.flush();
//ex6
//        Scanner sc = new Scanner(System.in);
//        writer.write("\n" + sc.next());
//        writer.write("\n" + sc.next());
//        writer.write("\n" + sc.next());
//        writer.write("\n" + sc.next());
//        writer.write("\n" + sc.next());
//        writer.close();
//        System.out.println(writer.toString());
//        //ex7
//        String str="programing";
//        Writer writer2 = new FileWriter("text" +str +".txt");
    }
}
