export default function pattern_6() {
  let row = 5;
  let column = 9;

  const symbol = "*";
  let toggle = false;
  for (let i = 0; i < row; i++) {
    toggle = true;
    for (let j = 0; j < column; j++) {
      if (j >= row - 1 - i && j <= row - 1 + i && toggle) {
        toggle = false;
        process.stdout.write(`${symbol}`);
      } else {
        toggle = true;
        process.stdout.write(" ");
      }
    }
    process.stdout.write("\n");
  }
}
