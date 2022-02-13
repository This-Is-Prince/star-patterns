pub fn pattern_3() {
    let row = 5;
    let column = 5;
    let symbol = "*";

    for i in 0..row {
        for j in 0..column {
            if j >= i {
                print!("{}", symbol);
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
