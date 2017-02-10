<meta charset="utf-8">
<script>
function getRandomInt(min, max) {
return Math.floor(Math.random()* (max - min +1)) + min;
}
function getCard() {
var cards = ['6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A'];
return cards[getRandomInt(0, cards.length - 1)];
}
var dealer = [getCard()];
var player = [getCard(), getCard()];
function getSum(arr) {
var i = 0;
var sum = 0;
for (i=0; i<arr.length; i++) {
if (arr[i] !== 'A') {
if (arr[i] == 'J' || arr[i] == 'Q' || arr[i] == 'K') {
arr[i] = 10
} 
sum = sum + +arr[i];
}
else if (arr[i] == 'A') {
if (sum > 10) {
sum = sum + 1;
} else { 
sum = sum + 11; }
}
}
return sum;
}
var summa = getSum(player);
function getStatus() {
return 'Дилер: ' + dealer.join(' ') + " Игрок: " + player.join(' ')
}
var answer = '';
do {
if (getSum(player) == 21) {
alert(getStatus() + " Вы победили");
break;
} else if (getSum(player) > 21) {
alert (getStatus() + " Перебор");
break;
}
answer = prompt(getStatus() + ' Хотите ещё карту? 1 - да, другое - нет');
if (answer =='1') {
player.push(getCard());
}
}
while(answer == '1');
</script>
