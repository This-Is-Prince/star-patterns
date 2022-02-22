pub fn pattern_16() {
    let row = 9;
    let column = 9;
    let symbol = "*";
    let mut index = 0;

    for _ in 0..row {
        for j in 0..column {
            if j == index {
                print!("\\")
            } else if j == column - 1 - index {
                print!("/")
            } else {
                print!("{}", symbol)
            }
        }
        index += 1;
        println!();
    }
}
