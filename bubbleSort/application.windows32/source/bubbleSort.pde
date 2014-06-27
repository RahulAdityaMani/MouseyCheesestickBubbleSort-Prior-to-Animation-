int[] cheesesticks = { 90, 150, 30, 22,56,34,67,213,78,23,67,43,98,89,45,63,92,26,42,87 };
int x;
int swap;
int size = 20;
boolean sorted = false;
void setup(){
  size (400, 250);
background (255);
}
void draw(){
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
