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
  
  ellipse(126,268,250,150);
}
