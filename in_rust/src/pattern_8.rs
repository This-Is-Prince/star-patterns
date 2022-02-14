pub fn pattern_8() {
    let row = 5;
    let column = 9;
    let mut symbol;

    for i in 0..row {
        symbol = 1;
        for j in 0..column {
            if j >= row - 1 - i && j <= row - 1 + i {
                print!("{}", symbol);
                if j < row - 1 {
                    symbol += 1;
                } else {
                    symbol -= 1;
                }
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
