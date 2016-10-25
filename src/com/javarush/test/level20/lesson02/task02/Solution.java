package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setBirthDate(dateFormat.parse("15.05.1991"));
            user.setCountry(User.Country.RUSSIA);
            user.setFirstName("Valentin");
            user.setLastName("Vedeshkin");
            user.setMale(true);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy",Locale.ENGLISH);

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter pw = new PrintWriter(outputStream);
            for (User user : users)
            {
                pw.println("#");
                if(user.getFirstName()== null) {pw.println("NoFirstName");} else { pw.println(user.getFirstName());}
                if (user.getLastName()== null ) { pw.println("NoLastName");} else {pw.println(user.getLastName());}
                if (user.getBirthDate() == null) {pw.println("NoBD");} else {pw.println(df.format(user.getBirthDate()));}
                if (user.getCountry()==null) { pw.println("UnknowLocation");} else {pw.println(user.getCountry());}
                    pw .println(String.valueOf(user.isMale()));

            }
                pw.close();
        }


        public void load(InputStream inputStream) throws Exception
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = input.readLine()) != null)
            {
                if (line.equals("#"))
                {
                    User user = new User();
                    String name = input.readLine();
                    String lastName = input.readLine();
                    String birthdayDate = input.readLine();
                    String country = input.readLine();
                    String sex = input.readLine();
                    user.setFirstName(name.equals("NoFirstName")?null:name);
                    user.setLastName(name.equals("NoLastName")?null:lastName);
                    user.setBirthDate(birthdayDate.equals("NoBD")?null:df.parse(birthdayDate));
                    user.setCountry(country.equals("UnknowLocation")?null:User.Country.valueOf(country));
                    user.setMale(Boolean.parseBoolean(sex));
                    users.add(user);


                }
            }
            input.close();
        }



                }
            }
