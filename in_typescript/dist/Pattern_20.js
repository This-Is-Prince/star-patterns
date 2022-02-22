"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_20() {
    let row = 4;
    let column = 8;
    let firstSymbol = "A";
    let secondSymbol = 1;
    const halfColumn = Math.floor(column / 2);
    for (let i = 0; i < row; i++) {
        firstSymbol = "A";
        secondSymbol = 1;
        for (let j = 0; j < column; j++) {
            if (j >= halfColumn - 1 - i && j <= halfColumn + i) {
                if (j < halfColumn) {
                    process.stdout.write(`${firstSymbol}`);
                    let s = firstSymbol.charCodeAt(0);
                    firstSymbol = String.fromCharCode(s + 1);
                }
                else {
                    process.stdout.write(`${secondSymbol}`);
                    secondSymbol++;
                }
            }
            else {
                process.stdout.write(` `);
            }
        }
        process.stdout.write(`\n`);
    }
}
exports.default = pattern_20;
