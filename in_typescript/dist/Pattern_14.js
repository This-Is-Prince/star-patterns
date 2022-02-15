"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_14() {
    let row = 7;
    let column = 7;
    let symbol = row - 1;
    for (let i = 0; i < row; i++) {
        symbol = row - 1 - i;
        for (let j = 0; j < column; j++) {
            if (j <= column - 1 - i) {
                process.stdout.write(`${symbol}`);
                symbol--;
            }
            else {
                process.stdout.write(" ");
            }
        }
        process.stdout.write("\n");
    }
}
exports.default = pattern_14;
