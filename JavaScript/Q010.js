//Q010. 별찍기
// 입력 : 5
// 결과 : 
/*
    *
   ***
  *****
 *******
*********

*/

// 5개 고정 출력

for(let i = 0; i < 5; i++)  {
    for(let j=4; j > i; j--)  {
      // space
      document.write('&nbsp');
    }
    for(let j=0; j <= i; j++)  {
      document.write('*');
    }
    for(let j=1; j <= i; j++)  {
      document.write('*');
    }
    document.write('<br>');
}

//입력받아 하기

let result = prompt("숫자만 입력하세요");

for(let i = 0; i < result; i++)  {
    for(let j=result-1; j > i; j--)  {
      // space
      document.write('&nbsp');
    }
    for(let j=0; j <= i; j++)  {
      document.write('*');
    }
    for(let j=1; j <= i; j++)  {
      document.write('*');
    }
    document.write('<br>');
}