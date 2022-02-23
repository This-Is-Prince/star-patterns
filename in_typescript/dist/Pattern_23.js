"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function pattern_23() {
    let row = 6;
    let column = 6;
    let symbol = 1;
    for (let i = 0; i < row; i++) {
        symbol = 1;
        for (let j = 0; j < column; j++) {
            if (j <= i) {
                process.stdout.write(`${symbol}`);
                if (symbol == 0) {
                    symbol = 1;
                }
                else {
                    symbol = 0;
                }
            }
            else {
                process.stdout.write(` `);
            }
        }
        process.stdout.write(`\n`);
    }
}
exports.default = pattern_23;
