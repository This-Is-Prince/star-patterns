"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_13() {
    let row = 5;
    let column = 9;
    let symbol = 1;
    for (let i = 0; i < row; i++) {
        symbol = 1 + i;
        for (let j = 0; j < column; j++) {
            if (j >= row - 1 - i && j <= row - 1 + i) {
                process.stdout.write(`${symbol}`);
                if (j < row - 1) {
                    symbol++;
                }
                else {
                    symbol--;
                }
            }
            else {
                process.stdout.write(" ");
            }
        }
        process.stdout.write("\n");
    }
}
exports.default = pattern_13;
