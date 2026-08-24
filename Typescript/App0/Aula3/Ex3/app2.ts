import prompt from 'prompt-sync'
const sc = prompt();

import * as fn from './app1.ts'

let tc = fn.totalCompra(1200)
let c = fn.cupom(200)
let qp = fn.qtdParcelas(6)
let f =fn.final( tc,c, qp)
fn.menu()