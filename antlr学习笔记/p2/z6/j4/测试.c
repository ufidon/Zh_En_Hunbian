// Terence Parr提取的一个C语言子集

// 全局变量
整型 人数 = 10;
// 浮型 全班身高[50];

浮型 小李身高 = 全班身高[23];

// 阶乘函数
整型 阶乘(整型 数){
    若 数 == 0 则 返 1;
    返 数*阶乘(数-1);
}