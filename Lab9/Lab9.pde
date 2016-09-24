int numCols = 8;
int numRows = 8;
int colWidth;
int rowHeight;
void setup() {
  size(800,800);
  background(20);
  colWidth = width/numCols;   //width is set in the size function
  rowHeight = height/numRows; //height is set in the size function
  drawBoard();
}

void drawBoard(){
  //fill(0,200,0); 
  //rect(0, 0, 80, 80);
  //fill(200,0,0);  
  //rect(80, 0, 80, 80); 
  for(int i = 0; i < numRows; i++){
    for(int j = 0; j < numCols; j++){
      if(i%2 == j%2){
        fill(150,0,0);
      }else{
        fill(255,0,0);
      }
      rect(j*80,i*80,80,80);
    }
  }
}