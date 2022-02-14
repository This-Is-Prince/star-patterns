pub fn pattern_9() {
    let row = 5;
    let column = 9;
    let mut symbol: u8;

    for i in 0..row {
        symbol = 65;
        for j in 0..column {
            if j <= row - 1 - i || j >= row - 1 + i {
                print!("{}", symbol as char);
            } else {
                print!(" ");
            }
            if j < row - 1 {
                symbol += 1;
            } else {
                symbol -= 1;
            }
        }
        println!();
    }
}
