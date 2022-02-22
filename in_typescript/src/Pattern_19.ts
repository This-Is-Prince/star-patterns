export default function pattern_19() {
  let row = 5;
  let column = 9;
  let symbol = "A";
  const halfColumn = Math.floor(column / 2);

  for (let i = 0; i < row; i++) {
    symbol = "A";
    for (let j = 0; j < column; j++) {
      if (j >= halfColumn - i && j <= halfColumn + i) {
        process.stdout.write(`${symbol}`);
        let s = symbol.charCodeAt(0);
        symbol = String.fromCharCode(j < halfColumn ? s + 1 : s - 1);
      } else {
        process.stdout.write(` `);
      }
    }
    process.stdout.write(`\n`);
  }
}
