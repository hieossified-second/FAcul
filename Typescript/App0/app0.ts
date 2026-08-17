import promp from 'prompt-sync';
import * as funcao from './funcao.ts';
const sc =promp();

console.log("Digite uma nota");
let a: number = Number(sc());

console.log("Digite a 2");
let b: number = Number(sc());

console.log("Digite a 3");
let c: number = Number(sc());

let m = funcao.calcularMedia(a,b,c);
let s = funcao.statusSituacao(m);

console.log(`\nMédia: ${m.toFixed(2)}`)
console.log(`Situacao: ${s}`)