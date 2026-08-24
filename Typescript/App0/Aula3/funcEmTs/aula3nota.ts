import prompt from 'prompt-sync';
const sc = prompt();

import * as fn from './aula3.ts';

console.log('--ESCREVA TRES NOTAS--');

let n1 = fn.pedirNota("Informe uma nota: ");
let n2 = fn.pedirNota("Informe uma nota: ");
let n3 = fn.pedirNota("Informe uma nota: ");
let md = fn.calcularMedia(n1, n2, n3);
let st = fn.sit(md);
fn.apresentarResposta(n1,n2,n3,md,st);

