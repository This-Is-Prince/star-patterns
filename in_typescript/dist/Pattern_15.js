"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_14() {
    let row = 9;
    let column = 5;
    let halfRow = Math.floor(row / 2);
    let symbol = 1;
    for (let i = 0; i < row; i++) {
        symbol = 1;
        for (let j = 0; j < column; j++) {
            if (i < halfRow) {
                if (j >= column - 1 - i) {
                    process.stdout.write(`${symbol}`);
                    symbol++;
                }
                else {
                    process.stdout.write(" ");
                }
            }
            else {
                if (j >= i - column + 1) {
                    process.stdout.write(`${symbol}`);
                    symbol++;
                }
                else {
                    process.stdout.write(" ");
                }
            }
        }
        process.stdout.write("\n");
    }
}
exports.default = pattern_14;
