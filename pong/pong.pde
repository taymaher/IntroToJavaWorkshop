Integer x=200;
Integer speed=10;
Integer y=100;
Integer hight=5;
 void setup(){
 size(800,900);

 
 
}
void draw(){
 background(9,100,9);
  fill(random(255),random(255),random(255));
  ellipse(x,y,50,50);
 stroke(132,133,144);
 
 x=x+speed;
 y=y+hight;
 
 if(x>800){
   speed=-speed;
 }
  if(x<0){
    speed=-speed;
  }
 if(y<0){
   hight=-hight;
   
 }
  if(y>900){
  hight=-hight;
  
  }
  rect(mouseX,450,100,20);


 if(intersects(x,y, mouseX,450, 100)){
 hight=-hight;
 }
} 
 
 
 boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
