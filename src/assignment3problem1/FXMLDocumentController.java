/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3problem1;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Pranay Reddy Gade
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextArea input;
    @FXML
    private TextArea output;
    @FXML
    private Button compute;

    String alpha_A[][] = {
        {"  * * *    "}, 
        {"*       *  "}, 
        {"*       *  "}, 
        {"*       *  "},
        {"* * * * *  "}, 
        {"*       *  "}, 
        {"*       *  "}, 
        {"*       *  "},
        {"           "}, 
        {"           "}, 
        {"           "}, 
        {"           "}};
    String alpha_B[][] = {{"* * * *    "}, {"*       *  "}, {"*       *  "}, {"* * * *    "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"* * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_C[][] = {{"  * * *    "}, {"*       *  "}, {"*          "}, {"*          "},
    {"*          "}, {"*          "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_D[][] = {{"* * * *    "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"* * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_E[][] = {{"* * * * *  "}, {"*          "}, {"*          "}, {"*          "},
    {"* * * * *  "}, {"*          "}, {"*          "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_F[][] = {{"* * * * *  "}, {"*          "}, {"*          "}, {"*          "},
    {"* * * *    "}, {"*          "}, {"*          "}, {"*          "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_G[][] = {{"  * * *    "}, {"*       *  "}, {"*          "}, {"*          "},
    {"*     * *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_H[][] = {{"*       *  "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"* * * * *  "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_I[][] = {{"* * * * *  "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_J[][] = {{"    * * *  "}, {"        *  "}, {"        *  "}, {"        *  "},
    {"        *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_K[][] = {{"*          "}, {"*       *  "}, {"*     *    "}, {"*   *      "},
    {"* *        "}, {"*  *       "}, {"*    *     "}, {"*      *   "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_L[][] = {{"*          "}, {"*          "}, {"*          "}, {"*          "},
    {"*          "}, {"*          "}, {"*          "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_M[][] = {{"*       *  "}, {"* *   * *  "}, {"*   *   *  "}, {"*   *   *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_N[][] = {{"*       *  "}, {"*       *  "}, {"* *     *  "}, {"*   *   *  "},
    {"*     * *  "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_O[][] = {{"  * * *    "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_P[][] = {{"* * * *    "}, {"*       *  "}, {"*       *  "}, {"* * * *    "},
    {"*          "}, {"*          "}, {"*          "}, {"*          "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_Q[][] = {{"  * * *    "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"*       *  "}, {"*   *   *  "}, {"*     *    "}, {"  * *   *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_R[][] = {{"* * * *    "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"* * * *    "}, {"*   *      "}, {"*     *    "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_S[][] = {{"  * * *    "}, {"*       *  "}, {"*          "}, {"*          "},
    {"  * * *    "}, {"        *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_T[][] = {{"* * * * *  "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_U[][] = {{"*       *  "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_V[][] = {{"*       *  "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"  *   *    "}, {"    *      "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_W[][] = {{"*       *  "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"*   *   *  "}, {"*   *   *  "}, {"* *   * *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_X[][] = {{"*       *  "}, {"*       *  "}, {"  *   *    "}, {"    *      "},
    {"  *   *    "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_Y[][] = {{"*       *  "}, {"*       *  "}, {"  *   *    "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_Z[][] = {{"           "}, {"* * * * *  "}, {"        *  "}, {"      *    "},
    {"    *      "}, {"  *        "}, {"*          "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};

    //SMALL_ALPHABETS
    String alpha_a[][] = {{"           "}, {"           "}, {"           "}, {"* * * *    "},
    {"        *  "}, {"  * * * *  "}, {"*       *  "}, {"  * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_b[][] = {{"*          "}, {"*          "}, {"*          "}, {"*          "},
    {"* * * *    "}, {"*       *  "}, {"*       *  "}, {"* * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_c[][] = {{"           "}, {"           "}, {"  * * *    "}, {"*       *  "},
    {"*          "}, {"*          "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_d[][] = {{"        *  "}, {"        *  "}, {"        *  "}, {"  * * * *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_e[][] = {{"           "}, {"           "}, {"  * * *    "}, {"*       *  "},
    {"* * * * *  "}, {"*          "}, {"*          "}, {"  * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_f[][] = {{"      * *  "}, {"    *      "}, {"    *      "}, {"  * * *    "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_g[][] = {{"           "}, {"           "}, {"           "}, {"           "},
    {"  * * * *  "}, {"*       *  "}, {"*       *  "}, {"  * * * *  "},
    {"        *  "}, {"        *  "}, {"*       *  "}, {"  * * *    "}};
    String alpha_h[][] = {{"*          "}, {"*          "}, {"*          "}, {"*          "},
    {"* * * *    "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_i[][] = {{"    *      "}, {"           "}, {"  * *      "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_j[][] = {{"    *      "}, {"           "}, {"  * *      "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"    *      "}, {"    *      "}, {"* *        "},
    {"           "}, {"           "}};
    String alpha_k[][] = {{"           "}, {"*       *  "}, {"*     *    "}, {"*   *      "},
    {"* *        "}, {"*  *       "}, {"*    *     "}, {"*      *   "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_l[][] = {{"    *      "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_m[][] = {{"           "}, {"           "}, {"           "}, {"* *   *    "},
    {"*   *   *  "}, {"*   *   *  "}, {"*   *   *  "}, {"*   *   *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_n[][] = {{"           "}, {"           "}, {"           "}, {"* * * *    "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_o[][] = {{"           "}, {"           "}, {"           "}, {"  * * *    "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_p[][] = {{"           "}, {"           "}, {"           "},
    {"           "}, {"* * * *    "}, {"*       *  "}, {"*       *  "},
    {"* * * *    "}, {"*          "}, {"*          "}, {"*          "}, {"           "}};
    String alpha_q[][] = {{"           "}, {"           "}, {"           "},
    {"           "}, {"  * * *    "}, {"*     *    "}, {"*     *    "},
    {"  * * *    "}, {"      *    "}, {"      * *  "}, {"      *    "}, {"           "}};
    String alpha_r[][] = {{"           "}, {"           "}, {"*   * *    "}, {"* *        "},
    {"*          "}, {"*          "}, {"*          "}, {"*          "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_s[][] = {{"           "}, {"           "}, {"           "}, {"  * * * *  "},
    {"*          "}, {"  * * *    "}, {"        *  "}, {"* * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_t[][] = {{"  *        "}, {"  *        "}, {"* * *      "}, {"  *        "},
    {"  *        "}, {"  *        "}, {"  *     *  "}, {"    * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_u[][] = {{"           "}, {"           "}, {"           "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_v[][] = {{"           "}, {"           "}, {"           "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"  *   *    "}, {"    *      "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_w[][] = {{"           "}, {"           "}, {"           "}, {"*       *  "},
    {"*   *   *  "}, {"*   *   *  "}, {"* *   * *  "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_x[][] = {{"           "}, {"           "}, {"           "}, {"*       *  "},
    {"  *   *    "}, {"    *      "}, {"  *   *    "}, {"*       *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String alpha_y[][] = {{"           "}, {"           "},
    {"           "}, {"           "}, {"*     *    "}, {"*     *    "},
    {"*     *    "}, {"  * * *    "}, {"      *    "}, {"* * *      "}, {"           "}, {"           "}};
    String alpha_z[][] = {{"           "}, {"           "}, {"           "}, {"* * * * *  "},
    {"      *    "}, {"    *      "}, {"  *        "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};

    //DIGITS:
    String digit_Zero[][] = {{"  * * *    "}, {"*       *  "}, {"*       *  "}, {"*       *  "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_One[][] = {{"    *      "}, {"  * *      "}, {"*   *      "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Two[][] = {{"  * * *    "}, {"*       *  "}, {"        *  "}, {"      *    "},
    {"    *      "}, {"  *        "}, {"*          "}, {"* * * * *  "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Three[][] = {{"  * * *    "}, {"*       *  "}, {"        *  "}, {"    * *    "},
    {"        *  "}, {"        *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Four[][] = {{"      *    "}, {"    * *    "}, {"  *   *    "}, {"* * * * *  "},
    {"      *    "}, {"      *    "}, {"      *    "}, {"      *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Five[][] = {{"* * * * *  "}, {"*          "}, {"*          "}, {"* * * *    "},
    {"        *  "}, {"        *  "}, {"        *  "}, {"* * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Six[][] = {{"  * * *    "}, {"*       *  "}, {"*          "}, {"* * * *    "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Seven[][] = {{"* * * * *  "}, {"        *  "}, {"      *    "}, {"    *      "},
    {"    *      "}, {"    *      "}, {"    *      "}, {"    *      "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Eight[][] = {{"  * * *    "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"*       *  "}, {"*       *  "}, {"*       *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    String digit_Nine[][] = {{"  * * *    "}, {"*       *  "}, {"*       *  "}, {"  * * * *  "},
    {"        *  "}, {"        *  "}, {"        *  "}, {"  * * *    "},
    {"           "}, {"           "}, {"           "}, {"           "}};
    
    String space[][] = {{"           "},{"           "}, {"           "}, {"           "},
        {"           "},{"           "}, {"           "}, {"           "},
        {"           "},{"           "},{"           "}, {"           "}};

    @FXML
    public void handleButtonAction(String line) {
      //  output.clear();
      //  String input1 = input.getText();
      //  System.out.println(input1);
      //  System.out.println(input1.length());
      //  System.out.println(input1.split("[\n|\r]").length);

      //  String[] s1 =input1.split("[\n]");
      //  System.out.println("####"+s1[0]);
      
        String s = line;
        
        try {
                for (int m = 0; m < 12; m++) {
                    for (int n = 0; n < s.length(); n++) {
                        switch (s.charAt(n)) {
                            case 'A':
                                displayCh(alpha_A, m);
                                break;
                            case 'B':
                                displayCh(alpha_B, m);
                                break;
                            case 'C':
                                displayCh(alpha_C, m);
                                break;
                            case 'D':
                                displayCh(alpha_D, m);
                                break;
                            case 'E':
                                displayCh(alpha_E, m);
                                break;
                            case 'F':
                                displayCh(alpha_F, m);
                                break;
                            case 'G':
                                displayCh(alpha_G, m);
                                break;
                            case 'H':
                                displayCh(alpha_H, m);
                                break;
                            case 'I':
                                displayCh(alpha_I, m);
                                break;
                            case 'J':
                                displayCh(alpha_J, m);
                                break;
                            case 'K':
                                displayCh(alpha_K, m);
                                break;
                            case 'L':
                                displayCh(alpha_L, m);
                                break;
                            case 'M':
                                displayCh(alpha_M, m);
                                break;
                            case 'N':
                                displayCh(alpha_N, m);
                                break;
                            case 'O':
                                displayCh(alpha_O, m);
                                break;
                            case 'P':
                                displayCh(alpha_P, m);
                                break;
                            case 'Q':
                                displayCh(alpha_Q, m);
                                break;
                            case 'R':
                                displayCh(alpha_R, m);
                                break;
                            case 'S':
                                displayCh(alpha_S, m);
                                break;
                            case 'T':
                                displayCh(alpha_T, m);
                                break;
                            case 'U':
                                displayCh(alpha_U, m);
                                break;
                            case 'V':
                                displayCh(alpha_V, m);
                                break;
                            case 'W':
                                displayCh(alpha_W, m);
                                break;
                            case 'X':
                                displayCh(alpha_X, m);
                                break;
                            case 'Y':
                                displayCh(alpha_Y, m);
                                break;
                            case 'Z':
                                displayCh(alpha_Z, m);
                                break;

                            //SMALL ALPHABETS    
                            case 'a':
                                displayCh(alpha_a, m);
                                break;
                            case 'b':
                                displayCh(alpha_b, m);
                                break;
                            case 'c':
                                displayCh(alpha_c, m);
                                break;
                            case 'd':
                                displayCh(alpha_d, m);
                                break;
                            case 'e':
                                displayCh(alpha_e, m);
                                break;
                            case 'f':
                                displayCh(alpha_f, m);
                                break;
                            case 'g':
                                displayCh(alpha_g, m);
                                break;
                            case 'h':
                                displayCh(alpha_h, m);
                                break;
                            case 'i':
                                displayCh(alpha_i, m);
                                break;
                            case 'j':
                                displayCh(alpha_j, m);
                                break;
                            case 'k':
                                displayCh(alpha_k, m);
                                break;
                            case 'l':
                                displayCh(alpha_l, m);
                                break;
                            case 'm':
                                displayCh(alpha_m, m);
                                break;
                            case 'n':
                                displayCh(alpha_n, m);
                                break;
                            case 'o':
                                displayCh(alpha_o, m);
                                break;
                            case 'p':
                                displayCh(alpha_p, m);
                                break;
                            case 'q':
                                displayCh(alpha_q, m);
                                break;
                            case 'r':
                                displayCh(alpha_r, m);
                                break;
                            case 's':
                                displayCh(alpha_s, m);
                                break;
                            case 't':
                                displayCh(alpha_t, m);
                                break;
                            case 'u':
                                displayCh(alpha_u, m);
                                break;
                            case 'v':
                                displayCh(alpha_v, m);
                                break;
                            case 'w':
                                displayCh(alpha_w, m);
                                break;
                            case 'x':
                                displayCh(alpha_x, m);
                                break;
                            case 'y':
                                displayCh(alpha_y, m);
                                break;
                            case 'z':
                                displayCh(alpha_z, m);
                                break;

                            //DIGITS:
                            case '0':
                                displayCh(digit_Zero, m);
                                break;
                            case '1':
                                displayCh(digit_One, m);
                                break;
                            case '2':
                                displayCh(digit_Two, m);
                                break;
                            case '3':
                                displayCh(digit_Three, m);
                                break;
                            case '4':
                                displayCh(digit_Four, m);
                                break;
                            case '5':
                                displayCh(digit_Five, m);
                                break;
                            case '6':
                                displayCh(digit_Six, m);
                                break;
                            case '7':
                                displayCh(digit_Seven, m);
                                break;
                            case '8':
                                displayCh(digit_Eight, m);
                                break;
                            case '9':
                                displayCh(digit_Nine, m);
                                break;
                                
                            case ' ':
                                displayCh(space, m);
                                break;

                            default:
                                //output.clear();
                                output.setText("Invalid Character");
                                return;

                        }
                    }
                    output.appendText("\n");
                }

        } catch (Exception err) {
            System.out.println("Invalid Character");
            input.setText("Invalid Character");
        }

    }

    public void displayCh(String[][] s, int m) {
        output.appendText(s[m][0]);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        output.setStyle("-fx-font-family: monospace");
        //output.textProperty().bind(input.textProperty());
        input.textProperty().addListener((ObservableValue<? extends String> observableValue, String oldValue, String newValue) -> {
            String[] lines = input.getText().split("\n");
            output.clear();
            for(int i=0;i<lines.length;i++){
                handleButtonAction(input.getText().split("\n")[i]);
                output.appendText("\n");
            }
        });
    }

}
