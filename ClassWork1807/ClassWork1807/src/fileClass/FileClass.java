package fileClass;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClass {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String fullName = "";
        String dirName = System.getProperty("user.dir");
        fullName = dirName + File.separator + fileName;
        System.out.println("File path :" + fullName);

        File file = new File(fileName);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("Something wrong");
                }
            } catch (IOException ex) {
                Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File already exists!");
        }

        //создание директорий
        String dirname = dirName + "/tmp/user/java/bin/exampleFolder";
        File d = new File(dirname);
        d.mkdirs();
        System.out.println(d.getTotalSpace());
        System.out.println(d.getFreeSpace());

        //FileInputStream и FileOutputStream
        InputStream in = null;
        OutputStream out = null;
        byte[] buffer = null;
        try {
            in = new FileInputStream(new File("test.txt"));
            buffer = new byte[in.available()];
            in.read(buffer);
            File file1 = new File("outputFile.txt");
            out = new FileOutputStream(file1);
            out.write(buffer);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        //чтение файла порционно
        InputStream in1 = null;
        OutputStream out1 = null;
        byte[] buffer1 = new byte[8 * 1024];
        try {
            in1 = new FileInputStream(new File("2.jpg"));
            File file2 = new File("image.jpg");
            out1 = new FileOutputStream(file2);
            int bytesRead = 0;
            while ((bytesRead = in1.read(buffer1)) != -1) {
                out1.write(buffer1, 0, bytesRead);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        //Преобразование изображения в байтовый массив
        File fnew = new File("2.jpg");
        FileClass fileEx = new FileClass();
        try {
            BufferedImage bImage = ImageIO.read(fnew);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bImage, "jpg", baos);
            byte[] imageInByte = baos.toByteArray();
            FileClass.ImageFrame fileExInner = fileEx.new ImageFrame(imageInByte);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //ImageFrame
    public class ImageFrame {
        BufferedImage image = null;
        JFrame form = null;

        public ImageFrame(byte[] imageInByte) throws IOException {
            image = ImageIO.read(new ByteArrayInputStream(imageInByte));
            form = new JFrame();
            form.setSize(image.getWidth(),image.getHeight());
            form.setAlwaysOnTop(true);

            JPanel pn = new JPanel() {
                @Override
                public void paint(Graphics g) {
                    super.paint(g);
                    g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
                }
            };
            pn.setSize(image.getWidth(), image.getHeight());
            form.add(pn);
            form.setVisible(true);
        }
    }
}


