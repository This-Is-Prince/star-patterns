export default function pattern_18() {
  let row = 5;
  let column = 9;

  const symbol = "*";

  for (let i = 0; i < row; i++) {
    for (let j = 0; j < column; j++) {
      if (j >= i && j <= column - 1 - i) {
        process.stdout.write(`${symbol}`);
      } else {
        process.stdout.write(` `);
      }
    }
    process.stdout.write(`\n`);
  }
}
