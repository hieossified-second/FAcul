import prompt from 'prompt-sync'
const sc = prompt();

export function totalCompra(compra: number) : void{
    compra = Number(sc());
} 

export function qtdParcelas(parcela: number) : void{
    parcela = Number(sc());
    
}

export function cupom(desconto: number) : void{
    desconto = Number(sc())
}

export function final(tatalcomDesconto: number, cupom: number,parcela: number) : number {
    let f = Number(tatalcomDesconto + cupom) / parcela
    return f    
}


export function menu(totalCompra: number, cupom, parcela, final) : void {
    console.log(`Total da compra : ${totalCompra}`)
console.log(`Parcelas: ${parcela}`)
console.log("-------------------------------")
console.log("O TOTAL FICOU")
console.log(`Cupom de desconto: ${cupom}`)
console.log(`Final: ${final}`)
console.log(`valor da parcela: ${parcela}`)
}
