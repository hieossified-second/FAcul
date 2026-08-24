import prompt from 'prompt-sync'
const sc = prompt();


console.log("Digite o total da compra");
let totalCompra: number = Number(sc());

console.log("Digite a quantidade de parcelas");
let qtdParcelas: number = Number(sc());

console.log("Digite cupom de desconto");
let cupomDesconto: number = Number(sc());

let final = totalCompra - cupomDesconto;
let valParcela = final / qtdParcelas;

console.log(`Total da compra : ${totalCompra}`)
console.log(`Parcelas: ${qtdParcelas}`)
console.log("-------------------------------")
console.log("O TOTAL FICOU")
console.log(`Final: ${final}`)
console.log(`valor da parcela: ${valParcela}`)