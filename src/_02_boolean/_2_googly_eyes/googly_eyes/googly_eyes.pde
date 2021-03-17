PImage face;
void setup() {
   face = loadImage("ppg.png");
   size(800,600);
    face.resize(800,600);
}

void draw() {
  background(face);
  
  if(mousePressed){
    println(mouseX+" "+mouseY);
  }
  
  ellipse(126,268,225,165);
   ellipse(490,280,340,200);
  fill(#030303);
  ellipse(x,y,100,100);
  ellipse(x+350,y,100,100);
    fill(#FFFCFC);
    
    if (mouseX>14&&mouseX<238&&mouseY<350&&mouseY>186){
  x=mouseX;
  y=mouseY;
   
    }
}

   

int x=126;
int y=268;

    
