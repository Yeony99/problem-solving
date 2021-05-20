// Q014 : 3의 배수인가요?
// 3의 배수라면 '짝', 아니면 n 그대로 출력

let result = prompt("숫자만 입력하세요");

let i=0;
if(result%3 === 0) {
    console.log("짝! 🤲");
} else {
    console.log(result);
}