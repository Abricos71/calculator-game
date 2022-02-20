package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.sound.sampled.*;
import java.io.*;

public class Controller
{
    public static void clicksound() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        File audiofile = new File("clicksound.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audiofile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }

    @FXML
    private Button deccc;

    @FXML
    private Button bincc;

    @FXML
    private Button restsavebt;

    public void gotoDec() throws IOException, UnsupportedAudioFileException, LineUnavailableException
    {
        clicksound();

        try
        {
            if(!Controllers1.file.exists())
            {
                Controllers1.file.createNewFile();
                Main.correctanswercounters1 = 0;
                PrintWriter conf = new PrintWriter(Controllers1.file);
                conf.println(Main.correctanswercounters1);
                conf.close();
            }
                BufferedReader confscan;
                confscan = new BufferedReader(new FileReader("configs1.txt"));
                String line = confscan.readLine();
                Main.correctanswercounters1 = Integer.parseInt(line);
                confscan.close();
        }
        catch (Exception e)
        {
            System.out.println("error: " + e);
        }

        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Stage window = (Stage) deccc.getScene().getWindow();
        window.setScene(new Scene(root, 600, 700));

    }

    public void gotoBin() throws IOException, UnsupportedAudioFileException, LineUnavailableException
    {
        clicksound();

        try
        {
            if(!Controllers2.files2.exists())
            {
                Controllers2.files2.createNewFile();
                Main.correctanswercounters2 = 0;
                PrintWriter conf = new PrintWriter(Controllers2.files2);
                conf.println(Main.correctanswercounters2);
                conf.close();
            }
            BufferedReader confscan;
            confscan = new BufferedReader(new FileReader("configs2.txt"));
            String lines2 = confscan.readLine();
            Main.correctanswercounters2 = Integer.parseInt(lines2);
            confscan.close();
        }
        catch (Exception e)
        {
            System.out.println("error: " + e);
        }

        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Stage window = (Stage) bincc.getScene().getWindow();
        window.setScene(new Scene(root, 600, 700));
    }

    public void restartsave() throws IOException, UnsupportedAudioFileException, LineUnavailableException
    {
        clicksound();

        Main.correctanswercounters1 = 0;
        Main.correctanswercounters2 = 0;
        PrintWriter confs1 = new PrintWriter(Controllers1.file);
        PrintWriter confs2 = new PrintWriter(Controllers2.files2);
        confs1.println(Main.correctanswercounters1);
        confs2.println(Main.correctanswercounters2);
        confs1.close();
        confs2.close();
    }
}