//Q002. 배열의 내장 함수
// <pass> 부분에 배열 내장 함수를 이용해 코드를 입력하고 다음과 같이 출력되도록

/*
데이터
var arr = [200, 100, 300];
//pass
console.log(arr);

출력
[200, 100, 10000, 300]
*/

var arr = [200, 100, 300];
arr.splice(2,0,10000);
console.log(arr);
