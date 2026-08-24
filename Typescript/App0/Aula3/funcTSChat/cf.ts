import prompt from 'prompt-sync';
const sc = prompt();

import * as fn from './chat1.ts';

let soma = fn.somar(2,3)
fn.resultado(soma)

console.log("Digite seu nome")
let nome: string = String(sc());

fn.saudacao(nome)