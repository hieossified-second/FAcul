import prompt from 'prompt-sync';
const sc = prompt();

console.log("Ola solox");

console.log("Calculadora 5000 larp");
console.log("Digite os numeros pedidos e qual operador deseja utilizar");

console.log("1 - Numero");
let numb1: number = Number(sc());

console.log("2 - Numero");
let numb2: number = Number(sc());

console.log("Qual operador voce utilizara?:");
let operador: string = String(sc());

if (operador == "+"){
    console.log(numb1 + numb2);
}