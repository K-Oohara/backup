//問1
x = 0xE7 ^ 0x7E;
x1 = x % 16;
x2 = (x - x1) / 16;
document.write(x);
document.write("<br>0x" + x2 + x1);
