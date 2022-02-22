export default function pattern_16() {
  let row = 9;
  let column = 9;
  let symbol = "*";
  let index = 0;

  for (let i = 0; i < row; i++) {
    for (let j = 0; j < column; j++) {
      if (j == index) {
        process.stdout.write("\\");
      } else if (j == column - 1 - index) {
        process.stdout.write("/");
      } else {
        process.stdout.write(`${symbol}`);
      }
    }
    index++;
    process.stdout.write("\n");
  }
}
