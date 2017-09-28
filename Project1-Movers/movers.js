
function Mover(mShape){
  this.pos = new Vector(Math.random()*(canvas.width),Math.random()*(canvas.width))
  this.vel = new Vector(Math.random()*4-2,Math.random()*4-2);
  this.acc = new Vector(0,0);
  this.colorNum = Math.floor(Math.random()*256);
  this.mShape = mShape;
  //set conditions for different shape movers
  if(this.mShape === 2){ //rectangle
    this.width = Math.random()*20+20;
    this.height = Math.random()*20+20;
  } else if(this.mShape === 3){ //square
    this.width = Math.random()*20+20;
    this.height = this.width;
  } else if(this.mShape === 4){ //circle
    this.width = Math.random()*10+10;
  } else if(this.mShape === 5){ //triangle
    this.width = Math.random()*40+20;
    this.height = Math.random()*90-30;
  }
  if(this.mShape === 0){
    this.width = 50;
    this.height = 50;
  }
  if(this.mShape === 1){
    this.width = 50;
    this.height = 50;
  }
}

Mover.prototype.draw = function(){
  //draw the different shapes
  if(this.mShape === 0){
    ctx.rect(this.pos.x,this.pos.y,this.height,this.width);
    ctx.stroke();
  }
  if(this.mShape === 2){
    ctx.fillStyle = "rgb(0,0,"+this.colorNum+")";
    ctx.fillRect(this.pos.x,this.pos.y,this.height,this.width);
  } else if(this.mShape === 3){
    ctx.fillStyle = "rgb("+this.colorNum+",0,0)";
    ctx.fillRect(this.pos.x,this.pos.y,this.height,this.width);
  } else if(this.mShape === 4){
    ctx.beginPath();
    ctx.fillStyle = "rgb(0,"+this.colorNum+",0)";
    ctx.arc(this.pos.x,this.pos.y,this.width,0,2*Math.PI,true);
    ctx.fill();
  } else if(this.mShape === 5){
    ctx.beginPath();
    ctx.fillStyle = "rgb("+this.colorNum+","+this.colorNum+",0)";
    ctx.moveTo(this.pos.x,this.pos.y);
    ctx.lineTo(this.pos.x+(this.width/2),this.pos.y+this.height);
    ctx.lineTo(this.pos.x-(this.width/2),this.pos.y+this.height);
    ctx.fill();
  }
}

Mover.prototype.update = function(){
  //update where the movers are

  var vec = Vector.subGetNew(attractor.pos,this.pos);
  console.log(attractor.pos);
  if(vec.distance(attractor.pos)<300){
    vec = Vector.subGetNew(attractor.pos,this.pos);
    vec.normalize();
    vec.mult(.5);
    this.vel.add(vec);
    this.pos.add(this.vel);
  }else{
    this.vel.add(this.acc);
    this.pos.add(this.vel);
  }

  if(this.pos.x+this.vel.x<canvas.width && this.pos.x+this.vel.x>0 &&
    this.pos.y+this.vel.y<canvas.height && this.pos.y+this.vel.y>0){
      this.vel.limit(3);
    this.pos.add(this.vel);
  }
  else if(toggleWallBounce){
      this.vel.oppSign();
  }
  else{
    this.pos.x = Math.abs(this.pos.x-canvas.width);
    this.pos.y = Math.abs(this.pos.y-canvas.height);
  }
  this.draw();
}
