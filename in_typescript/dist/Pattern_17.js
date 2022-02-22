"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_17() {
    let row = 9;
    let column = 9;
    let index = 0;
    const symbol = "*";
    const halfRow = Math.floor(row / 2);
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < column; j++) {
            if (j > halfRow - index && j < halfRow + index) {
                process.stdout.write(` `);
            }
            else {
                process.stdout.write(`${symbol}`);
            }
        }
        if (i < halfRow) {
            index++;
        }
        else {
            index--;
        }
        process.stdout.write(`\n`);
    }
}
exports.default = pattern_17;
