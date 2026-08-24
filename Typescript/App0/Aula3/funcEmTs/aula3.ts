import prompt from 'prompt-sync'
const sc = prompt();

export function escrever(txt: string) : void{
    console.log(txt);
}

export function apresentarResposta(n1: number, n2: number, n3: number, md: number, sit: string) : void {
    console.log(`\n-----------`);
    console.log(`Notas: ${n1}, ${n2}, ${n3}`);
    console.log(`Media: ${md}`);
    console.log(`Situacao: ${sit}`);
}

export function pedirNota(txt: string) : number{
    console.log(txt);
    let nota = Number(sc());
    return nota;
}

export function calcularMedia(n1: number, n2: number, n3: number) : number {
    let media = (n1 + n2 + n3) / 3;
    return media;
}

export function sit(media: number) : string{
    let situacao = '';
    if (media >= 6){
        situacao = 'aprovado';
    }else {
        situacao = 'reprovado';
    }

    return situacao;
}