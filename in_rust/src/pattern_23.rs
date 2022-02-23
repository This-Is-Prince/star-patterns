pub fn pattern_23() {
    let row = 6;
    let column = 6;
    let mut symbol;

    for i in 0..row {
        symbol = 1;

        for j in 0..column {
            if j <= i {
                print!("{}", symbol);
                if symbol == 0 {
                    symbol = 1;
                } else {
                    symbol = 0;
                }
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
