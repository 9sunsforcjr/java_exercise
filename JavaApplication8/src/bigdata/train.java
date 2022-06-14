/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mactavish
 */
public class train {

    /**
     * 读取CSV文件
     *
     * @param filePath 文件路径（包括文件名）
     * @param hasTitle 是否有标题行
     * @return
     */
    public static List<List<String>> readCSV(String filePath, boolean hasTitle) {
        List<List<String>> data = new ArrayList<>();
        String line = null;
        try {
            //BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));
            if (hasTitle) {
                //第一行信息，为标题信息
                line = bufferedReader.readLine();
                String[] items = line.split(",");
                data.add(Arrays.asList(items));
                System.out.println("标题行：" + line);
            }

            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                i++;
                //数据行
                String[] items = line.split(",");
                data.add(Arrays.asList(items));
                System.out.println("第" + i + "行：" + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    /**
     * 写CSV文件
     *
     * @param data 数据
     * @param filePath 文件路径
     * @param fileName 文件名
     * @param hasTitle 是否有标题行
     */
    public static void writeCSV(List<List<String>> data, String filePath, String fileName, boolean hasTitle) {
        File csvFile = new File(filePath + "/" + fileName);
        BufferedWriter bufferedWriter = null;
        String line = null;
        try {
            // bufferedWriter=new BufferedWriter(new FileWriter(csvFile,true));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile), "utf-8"));
            for (int i = 0; i < data.size(); i++) {
                line = null;
                if (hasTitle) {
                    line = getLine(data.get(i));
                }
                System.out.println(line.toString());
                bufferedWriter.write(line.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取一行数据的csv格式的字符串
     *
     * @param items
     * @return
     */
    private static String getLine(List<String> items) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            line.append(items.get(i));
            if (i < (items.size() - 1)) {
                line.append(",");
            }
        }
        return line.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List data=readCSV("",false);
        data.
    }

}
