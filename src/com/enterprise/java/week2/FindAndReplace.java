package com.enterprise.java.week2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FindAndReplace {

    String inputFile;
    String outputFile;
    String findReplaceFile;
    Map<String, String> findReplaceValues = new HashMap<>();

    public FindAndReplace(String inputFile, String outputFile, String findReplaceFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.findReplaceFile = findReplaceFile;

    }

    public String getInputFile() {
        return inputFile;
    }

    public void launch() {

        createMapOfFindReplaceValues();
        String everything = reader();
        String replacedEverything = replace(everything);
        writer(replacedEverything);
    }

    public String reader() {

        String everything = "";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            everything = sb.toString();
            //System.out.print(everything);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return everything;
    }

    public void writer(String everything) {

        File correctFile = new File(outputFile);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(correctFile), "utf-8"))) {
            writer.write(everything);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String replace(String everything) {

        for (Map.Entry<String, String> entry : findReplaceValues.entrySet()) {

            everything = everything.replaceAll(entry.getKey(), entry.getValue());
        }

        System.out.println(everything);
        return everything;
    }

    public void createMapOfFindReplaceValues() {
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader(findReplaceFile))) {
            while (in.ready()) {
                line = in.readLine();
                String[] str = line.split(",");
                for (String s : str) {

                    String[] arr = s.split(":");
                    findReplaceValues.put(arr[0], arr[1]);
                    System.out.println(arr[0] + " " + arr[1]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
