import prompt from 'prompt-sync'
const sc = prompt();

export function somar(n1: number, n2: number) : number{
    let res = (n1 + n2)
    return res;
}

export function resultado(res: number) : void{
    console.log(`Resultado: ${res}`)
}

export function saudacao(nome: string) : void{
    console.log(`Ola ${nome}`)
}
