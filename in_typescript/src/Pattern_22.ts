export default function pattern_22() {
  let row = 4;
  let column = 7;
  let firstSymbol = 1;
  let secondSymbol = 65;
  let halfColumn = Math.floor(column / 2);

  for (let i = 0; i < row; i++) {
    firstSymbol = 1;
    secondSymbol = 65;
    for (let j = 0; j < column; j++) {
      if (j >= halfColumn - i && j <= halfColumn + i) {
        if (j <= halfColumn) {
          process.stdout.write(`${firstSymbol}`);
          firstSymbol++;
        } else {
          process.stdout.write(`${String.fromCharCode(secondSymbol)}`);
          secondSymbol++;
        }
      } else {
        process.stdout.write(` `);
      }
    }
    process.stdout.write(`\n`);
  }
}
