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

public class Controllers1

{
    private float firstnums1;
    private float lastnums1;
    private String operation;
    private String ansceckers1;
    float movecounters1;
    static File file = new File ("configs1.txt");
    String colors1_1,colors1_2,colors1_3,colors1_4;

    @FXML
    private AnchorPane mainscrnrs1;

    @FXML
    private Label maintexts1;

    @FXML
    private Button backtostartD;

    @FXML
    private Button ones1;

    @FXML
    private Button twos1;

    @FXML
    private Button threes1;

    @FXML
    private Button fours1;

    @FXML
    private Button fives1;

    @FXML
    private Button sixs1;

    @FXML
    private Button sevens1;

    @FXML
    private Button eights1;

    @FXML
    private Button nines1;

    @FXML
    private Button pluss1;

    @FXML
    private Button minuss1;

    @FXML
    private Button proizvedenies1;

    @FXML
    private Button zeros1;

    @FXML
    private Button results1;

    @FXML
    private Button deklenies1;

    @FXML
    private Button clears1;

    @FXML
    private TextField displays1;

    @FXML
    private Button checks1;

    @FXML
    private TextField taskdisplays1;

    @FXML
    private Button tasks1;

    @FXML
    private TextField movedisplays1;

    @FXML
    private GridPane topbuttonss1;

    @FXML
    private GridPane downbuttonss1;

    public void mous_in_s1()
    {
        colorchangers1();
    }

    public void ones1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "1");
        movecounters1++;
    }

    public void twos1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "2");
        movecounters1++;
    }

    public void threes1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "3");
        movecounters1++;
    }

    public void fours1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "4");
        movecounters1++;
    }

    public void fives1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "5");
        movecounters1++;
    }

    public void sixs1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "6");
        movecounters1++;
    }

    public void sevens1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "7");
        movecounters1++;
    }

    public void eights1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "8");
        movecounters1++;
    }

    public void nines1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "9");
        movecounters1++;
    }

    public void zeros1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText(displays1.getText() + "0");
        movecounters1++;
    }

    public void clears1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        displays1.setText("");
        movecounters1 = 0;
    }

    public void  pluss1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        String value = displays1.getText();
        float valuemetr = Float.parseFloat(value);
        this.firstnums1 = valuemetr;
        displays1.setText("");
        operation = "+";
        movecounters1++;
    }

    public void  minuss1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        String value = displays1.getText();
        float valuemetr = Float.parseFloat(value);
        this.firstnums1 = valuemetr;
        displays1.setText("");
        operation = "-";
        movecounters1++;
    }

    public void  proizvedenies1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        String value = displays1.getText();
        float valuemetr = Float.parseFloat(value);
        this.firstnums1 = valuemetr;
        displays1.setText("");
        operation = "*";
        movecounters1++;
    }

    public void  delenie1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        String value = displays1.getText();
        float valuemetr = Float.parseFloat(value);
        this.firstnums1 = valuemetr;
        displays1.setText("");
        operation = "/";
        movecounters1++;
    }

    public void results1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        switch (operation)
        {
            case "+":
                String value1 = displays1.getText();
                this.lastnums1 = Float.parseFloat(value1);
                float ans1 = this.firstnums1 + this.lastnums1;
                displays1.setText(String.valueOf(ans1));
                ansceckers1 = displays1.getText();
                break;
            case "-":
                String value2 = displays1.getText();
                this.lastnums1 = Float.parseFloat(value2);
                float ans2 = this.firstnums1 - this.lastnums1;
                displays1.setText(String.valueOf(ans2));
                ansceckers1 = displays1.getText();
                break;
            case "*":
                String value3 = displays1.getText();
                this.lastnums1 = Float.parseFloat(value3);
                float ans3 = this.firstnums1 * this.lastnums1;
                displays1.setText(String.valueOf(ans3));
                ansceckers1 = displays1.getText();
                break;
            case "/":
                String value4 = displays1.getText();
                this.lastnums1 = Float.parseFloat(value4);
                float ans4 = this.firstnums1 / this.lastnums1;
                displays1.setText(String.valueOf(ans4));
                ansceckers1 = displays1.getText();
                break;
        }
    }

    public void tasks1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        float randoms1 = (int) (Math.random()*100 - 0);
        String parse = String.valueOf(randoms1);
        taskdisplays1.setText(parse);
        float randommoves1 = (int) (4 + Math.random()*6);
        String parsemove = String.valueOf(randommoves1);
        movedisplays1.setText(parsemove);
    }

    public void checks1_click() throws UnsupportedAudioFileException, LineUnavailableException, IOException
    {
        Controller.clicksound();
        float ansscans1 = Float.parseFloat(taskdisplays1.getText());
        float movescans1 = Float.parseFloat(movedisplays1.getText());
        float ansctcks1 = Float.parseFloat(displays1.getText());

        if(ansctcks1 == ansscans1 && movecounters1 == movescans1)
        {
            taskdisplays1.setText("TRUE");
            movedisplays1.setText("");
            displays1.setText("");
            movecounters1 = 0;
            Main.correctanswercounters1++;
        }
        else if(ansctcks1 != ansscans1 || movecounters1 != movescans1)
        {
            taskdisplays1.setText("FALSE");
            movedisplays1.setText("");
            displays1.setText("");
            movecounters1 = 0;
        }

        colorchangers1();
    }

    public void comeback() throws IOException, UnsupportedAudioFileException, LineUnavailableException
    {
        Controller.clicksound();

        try
        {
            PrintWriter conf = new PrintWriter(Controllers1.file);
            conf.println(Main.correctanswercounters1);
            conf.close();
        }
        catch (Exception e)
        {
            System.out.println("error: " + e);
        }

        Parent root = FXMLLoader.load(getClass().getResource("scene0.fxml"));
        Stage window = (Stage) backtostartD.getScene().getWindow();
        window.setScene(new Scene(root, 600, 700));
    }


    public void chengecolors1(String fColor, String sColor, String tColor, String frthColor)
    {
        colors1_1 = fColor;
        colors1_2 = sColor;
        colors1_3 = tColor;
        colors1_4 = frthColor;
    }

    public  void colorchangers1()
    {
        if(Main.correctanswercounters1 == 0)
        //if(Main.correctanswercounters1 < 6 && Main.correctanswercounters1 >=0)
        {
            chengecolors1("#94d0cc", "#eec4c4", "#f29191", "#d1d9d9");
        }
        else if(Main.correctanswercounters1 == 1)
        //else if(Main.correctanswercounters1 < 11 && Main.correctanswercounters1 >=6)
        {
            chengecolors1("#5aa897", "#9dbeb9", "#f8a488", "#f8f5f1");
        }
        else if(Main.correctanswercounters1 >= 2)
        //else if(Main.correctanswercounters1 < 16 && Main.correctanswercounters1 >=11)
        {
            chengecolors1("#f8a488","#5aa897","#45526c","#f8f5f1");
        }

        topbuttonss1.setStyle("-fx-background-color: " + colors1_1);
        ones1.setStyle("-fx-background-color: " + colors1_1);
        twos1.setStyle("-fx-background-color: " + colors1_1);
        threes1.setStyle("-fx-background-color: " + colors1_1);
        fours1.setStyle("-fx-background-color: " + colors1_1);
        fives1.setStyle("-fx-background-color: " + colors1_1);
        sixs1.setStyle("-fx-background-color: " + colors1_1);
        sevens1.setStyle("-fx-background-color: " + colors1_1);
        eights1.setStyle("-fx-background-color: " + colors1_1);
        nines1.setStyle("-fx-background-color: " + colors1_1);
        zeros1.setStyle("-fx-background-color: " + colors1_1);
        clears1.setStyle("-fx-background-color: " + colors1_1);
        pluss1.setStyle("-fx-background-color: " + colors1_1);
        minuss1.setStyle("-fx-background-color: " + colors1_1);
        proizvedenies1.setStyle("-fx-background-color: " + colors1_1);
        deklenies1.setStyle("-fx-background-color: " + colors1_1);
        results1.setStyle("-fx-background-color: " + colors1_1);
        downbuttonss1.setStyle("-fx-background-color: " + colors1_2);
        backtostartD.setStyle("-fx-background-color: " + colors1_2);
        tasks1.setStyle("-fx-background-color: " + colors1_2);
        checks1.setStyle("-fx-background-color: " + colors1_2);
        taskdisplays1.setStyle("-fx-background-color: " + colors1_2);
        movedisplays1.setStyle("-fx-background-color: " + colors1_2);
        maintexts1.setStyle("-fx-text-fill: " + colors1_3);
        mainscrnrs1.setStyle("-fx-background-color: " + colors1_4);
    }
}
