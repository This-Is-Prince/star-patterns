"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_2() {
    let row = 5;
    let column = 5;
    const symbol = "*";
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < column; j++) {
            if (j >= row - 1 - i) {
                process.stdout.write(symbol);
            }
            else {
                process.stdout.write(" ");
            }
        }
        process.stdout.write("\n");
    }
}
exports.default = pattern_2;
