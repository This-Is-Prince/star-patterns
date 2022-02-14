"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_9() {
    let row = 5;
    let column = 9;
    let symbol = 65;
    for (let i = 0; i < row; i++) {
        symbol = 65;
        for (let j = 0; j < column; j++) {
            if (j <= row - 1 - i || j >= row - 1 + i) {
                process.stdout.write(`${String.fromCharCode(symbol)}`);
            }
            else {
                process.stdout.write(" ");
            }
            if (j < row - 1) {
                symbol++;
            }
            else {
                symbol--;
            }
        }
        process.stdout.write("\n");
    }
}
exports.default = pattern_9;
