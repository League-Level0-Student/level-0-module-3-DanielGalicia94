void setup(){
size(500,500);  
}
void draw() {
background(200,200,200);
for (int i = 8; i > 0; i--){
  if (i % 2 == 0) {
    fill(#030000);
  } else {
    fill(#FF0000);
  }
ellipse(250,250, i*50, i*50);  
}}
