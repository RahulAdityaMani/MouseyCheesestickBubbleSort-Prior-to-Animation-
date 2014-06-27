import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class bubbleSort extends PApplet {

int[] cheesesticks = { 90, 150, 30, 22,56,34,67,213,78,23,67,43,98,89,45,63,92,26,42,87 };
int x;
int swap;
int size = 20;
boolean sorted = false;
public void setup(){
  size (400, 250);
background (255);
}
public void draw(){
while (sorted==false){
  sorted = true;
  for (int i=0; i<size; i++){
    if ((i+1)<size && cheesesticks[i]>cheesesticks[i+1]){
      swap=cheesesticks[i];
      cheesesticks[i]=cheesesticks[i+1];
      cheesesticks[i+1]=swap;
      sorted = false;
      background(150);
    }
    fill(77,187,245);
    rect(x, 250-cheesesticks[i], 10, cheesesticks[i]);
    print (cheesesticks[i]+ " ");
    x+=15;
  }
  x=0;
}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "bubbleSort" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
