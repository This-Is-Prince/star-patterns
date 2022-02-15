export default function pattern_11() {
  let row = 9;
  let column = 5;

  let symbol = "*";
  let halfRow = Math.floor(row / 2);
  let tempI = 0;
  for (let i = 0; i < row; i++) {
    for (let j = 0; j < column; j++) {
      if (i <= halfRow) {
        if (j <= i) {
          process.stdout.write(`${symbol}`);
        } else {
          process.stdout.write(" ");
        }
      } else {
        tempI = row - 1 - i;
        if (j <= tempI) {
          process.stdout.write(`${symbol}`);
        } else {
          process.stdout.write(" ");
        }
      }
    }
    process.stdout.write("\n");
  }
}
