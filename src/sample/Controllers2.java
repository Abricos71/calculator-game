package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Controllers2

{
    private long firstnums2;
    private long lastnums2;
    private String operations2;
    private String ansceckers2;
    float movecounters2;
    static File files2 = new File ("configs2.txt");
    String colors2_1,colors2_2,colors2_3,colors2_4;

    @FXML
    private AnchorPane mainscrnrs2;

    @FXML
    private Label maintexts2;

    @FXML
    private Button zeros2;

    @FXML
    private Button ones2;

    @FXML
    private Button ors2;

    @FXML
    private Button ands2;

    @FXML
    private Button clears2;

    @FXML
    private Button results2;

    @FXML
    private TextField displays2;

    @FXML
    private Button checks2;

    @FXML
    private TextField taskdisplays2;

    @FXML
    private Button tasks2;

    @FXML
    private TextField movedisplays2;

    @FXML
    private GridPane topbuttonss2;

    @FXML
    private GridPane downbuttonss2;

    @FXML
    private Button backtostartBin;

    public void zeros2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays2.setText(displays2.getText() + "0");
        movecounters2++;
    }

    public void ones2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays2.setText(displays2.getText() + "1");
        movecounters2++;
    }

    public void clears2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays2.setText("");
        movecounters2 = 0;
    }

    public void ands2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {

        Controller.clicksound();
        String value = displays2.getText();
        int convert = Integer.parseInt(value, 2);
        this.firstnums2 = convert;
        displays2.setText("");
        operations2 = "*";
        movecounters2++;
    }

    public void ors2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        String value = displays2.getText();
        long convert = Integer.parseInt(value, 2);
        this.firstnums2 = convert;
        displays2.setText("");
        operations2 = "+";
        movecounters2++;
    }

    public void tasks2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        int randoms2 = (int) (Math.random()*31 - 1); //max=11111
        String parse = Integer.toBinaryString(randoms2);
        taskdisplays2.setText(parse);
        float randommoves2 = (int) (7 + Math.random()*5);//[7;12]
        String parsemove = String.valueOf(randommoves2);
        movedisplays2.setText(parsemove);
    }

    public void results2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        switch (operations2)
        {
            case "+":
                String value1 = displays2.getText();
                this.lastnums2 = Integer.parseInt(value1, 2);
                String binsum = Integer.toBinaryString((int) (firstnums2 + lastnums2));
                displays2.setText(binsum);
                ansceckers2 = displays2.getText();
                break;
            case "*":
                String value2 = displays2.getText();
                this.lastnums2 = Integer.parseInt(value2, 2);
                String binpr = Integer.toBinaryString((int) (firstnums2 * lastnums2));
                displays2.setText(binpr);
                ansceckers2 = displays2.getText();
                break;
        }
    }

    public void checks2_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        int ansscans2 = Integer.parseInt(taskdisplays2.getText());
        float movescans2 = Float.parseFloat(movedisplays2.getText());
        int ansctcks2 = Integer.parseInt(displays2.getText());

        if(ansctcks2 == ansscans2 && movecounters2 == movescans2)
        {
            taskdisplays2.setText("TRUE");
            movedisplays2.setText("");
            displays2.setText("");
            movecounters2 = 0;
            Main.correctanswercounters2++;
        }
        else if(ansctcks2 != ansscans2 || movecounters2 != movescans2)
        {
            taskdisplays2.setText("FALSE");
            movedisplays2.setText("");
            displays2.setText("");
            movecounters2 = 0;
        }

        colorchangers2();
    }


    public void mous_in_s2()
    {
        colorchangers2();
    }

    public void comebackBin() throws IOException, UnsupportedAudioFileException, LineUnavailableException
    {
        Controller.clicksound();

        try
        {
            PrintWriter conf = new PrintWriter(Controllers2.files2);
            conf.println(Main.correctanswercounters2);
            conf.close();
        }
        catch (Exception e)
        {
            System.out.println("error: " + e);
        }

        Parent root = FXMLLoader.load(getClass().getResource("scene0.fxml"));
        Stage window = (Stage) backtostartBin.getScene().getWindow();
        window.setScene(new Scene(root, 600, 700));
    }

    public void chengecolors2(String fColor, String sColor, String tColor, String frthColor)
    {
        colors2_1 = fColor;
        colors2_2 = sColor;
        colors2_3 = tColor;
        colors2_4 = frthColor;
    }

    public void colorchangers2()
    {
        if(Main.correctanswercounters2 == 0)
        //if(Main.correctanswercounters2 < 6 && Main.correctanswercounters2 >=0)
        {
            chengecolors2("#a7bbc7","#e1e5ea","#da7f8f","#faf3f3");
        }
        else if(Main.correctanswercounters2 == 1)
        //else if(Main.correctanswercounters2 < 11 && Main.correctanswercounters2 >= 6)
        {
            chengecolors2("#4aa96c","#9fe6a0","#f55c47","#564a4a");
        }
        else if(Main.correctanswercounters2 >= 2)
        //else if(Main.correctanswercounters2 < 16 && Main.correctanswercounters2 >=11)
        {
            chengecolors2("#7b6079","#a7d0cd","#de8971","#ffe9d6");
        }

        topbuttonss2.setStyle("-fx-background-color: " + colors2_1);
        ones2.setStyle("-fx-background-color: " + colors2_1);
        zeros2.setStyle("-fx-background-color: " + colors2_1);
        ands2.setStyle("-fx-background-color: " + colors2_1);
        ors2.setStyle("-fx-background-color: " + colors2_1);
        clears2.setStyle("-fx-background-color: " + colors2_1);
        results2.setStyle("-fx-background-color: " + colors2_1);
        downbuttonss2.setStyle("-fx-background-color: " + colors2_2);
        tasks2.setStyle("-fx-background-color: " + colors2_2);
        checks2.setStyle("-fx-background-color: " + colors2_2);
        taskdisplays2.setStyle("-fx-background-color: " + colors2_2);
        movedisplays2.setStyle("-fx-background-color: " + colors2_2);
        backtostartBin.setStyle("-fx-background-color: " + colors2_2);
        maintexts2.setStyle("-fx-text-fill: " + colors2_3);
        mainscrnrs2.setStyle("-fx-background-color: " + colors2_4);
    }
}
