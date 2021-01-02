/*
 Navicat Premium Data Transfer

 Source Server         : MongoDB
 Source Server Type    : MongoDB
 Source Server Version : 40020
 Source Host           : localhost:27017
 Source Schema         : freshshop

 Target Server Type    : MongoDB
 Target Server Version : 40020
 File Encoding         : 65001

 Date: 02/01/2021 20:47:56
*/


// ----------------------------
// Collection structure for product
// ----------------------------
db.getCollection("product").drop();
db.createCollection("product");

// ----------------------------
// Documents of product
// ----------------------------
db.getCollection("product").insert([ {
    _id: "1",
    pic: "/imgae/image1.jpg",
    note: "多买优惠/满2件，总价打9.50折；满3件，总价打9折/",
    detailTitle: "养生秘方",
    detailDescribe: "拔丝菜是我家家庭聚会必点的菜了，我妈最爱这个菜了。拔丝菜吃了不少，妈妈也是每年都做呢！自己试试，做法挺简单的，后来改良了一下，吃起来甜蜜蜜的，但不腻口，赞一个！",
    detailHtml: "https://item.jd.com/63371141142.html#crumb-wrap",
    commentId: [
        "1"
    ]
} ]);
db.getCollection("product").insert([ {
    _id: "2",
    pic: "/imgae/image2.jpg",
    note: "满减/每满680元，可减100元现金/",
    detailTitle: "食谱",
    detailDescribe: "鲅鱼在没完全解冻的时候切段，然后再去内脏，这样炸时候不容易碎。葱姜料酒，放冰箱冷藏腌制一宿。第二天拿出，小火慢炸。炸至金黄色，是不是很漂亮呀！葱姜蒜辣椒八角香叶准备好。葱姜八角辣椒香叶放入锅内，加酱油老抽白糖胡椒粉调味，煮开后放入鲅鱼，倒入少许白酒。慢炖，煮至汤汁收干。看着颜色很好看吧是不是很有食欲，动手做起来吧！",
    detailHtml: "https://item.jd.com/63371141143.html#crumb-wrap",
    commentId: [
        "2"
    ]
} ]);
db.getCollection("product").insert([ {
    _id: "3",
    pic: "/imgae/image3.jpg",
    note: "限购/该商品购买1-20件时享受单件价￥59.90，超出数量以结算价为准/",
    detailTitle: "小故事",
    detailDescribe: "鸡胸肉，是鸡身上最大的两块肉。常见鸡肉，鸡胸肉是在胸部里侧的肉，形状像斗笠，胸脯肉。肉质细嫩，滋味鲜美，营养丰富，能滋补养身。",
    detailHtml: "https://item.jd.com/65099103697.html#crumb-wrap",
    commentId: [
        "3",
        "4"
    ]
} ]);
db.getCollection("product").insert([ {
    _id: "26",
    pic: "/imgae/image4.jpg",
    note: "限购/该商品购买1-5件时享受单件价￥11.90，超出数量以结算价为准/",
    detailTitle: "品牌故事",
    detailDescribe: "光明乳业用心打造的每一款产品都在塑造一个品牌故事，在当前激烈的乳品竞争中独具特色。光明乳业在提升品牌价值的同时，更注重突出产品本身的优势，加快渠道拓展，牢固保持稳定的市场占有率。",
    detailHtml: "https://item.jd.com/5340854.html#crumb-wrap",
    commentId: [ ]
} ]);

// ----------------------------
// Collection structure for productComment
// ----------------------------
db.getCollection("productComment").drop();
db.createCollection("productComment");

// ----------------------------
// Documents of productComment
// ----------------------------
db.getCollection("productComment").insert([ {
    _id: "1",
    userId: "5fefff260e3a508e69ba1bbf",
    productId: "1",
    score: 4.5,
    content: "nice!"
} ]);
db.getCollection("productComment").insert([ {
    _id: "2",
    userId: "5fefff260e3a508e69ba1bbf",
    productId: "2",
    score: NumberInt("5"),
    content: "good!"
} ]);
db.getCollection("productComment").insert([ {
    _id: "3",
    userId: "5fefff260e3a508e69ba1bc0",
    productId: "3",
    score: 4.5,
    content: "nice!"
} ]);
db.getCollection("productComment").insert([ {
    _id: "4",
    userId: "5fefff260e3a508e69ba1bc0",
    productId: "3",
    score: NumberInt("3"),
    content: "bad!"
} ]);

// ----------------------------
// Collection structure for productSku
// ----------------------------
db.getCollection("productSku").drop();
db.createCollection("productSku");

// ----------------------------
// Documents of productSku
// ----------------------------
db.getCollection("productSku").insert([ {
    _id: "63371141142",
    productId: "1",
    price: "43.00",
    sp: {
        "质量": "净重5斤",
        "数量": "12枚精选",
        "大小": "（80-85mm）中大果"
    },
    promotionPrice: "42.00",
    sale: NumberInt("100")
} ]);
db.getCollection("productSku").insert([ {
    _id: "63371141143",
    productId: "1",
    price: "78.00",
    sp: {
        "质量": "净重10斤",
        "数量": "22枚精选",
        "大小": "（80-85mm）中大果"
    },
    promotionPrice: "70.00",
    sale: NumberInt("100")
} ]);
db.getCollection("productSku").insert([ {
    _id: "64549308691",
    productId: "2",
    price: "689.00",
    sp: {
        "类型": "698型吉祥富贵海鲜大礼包"
    },
    promotionPrice: "670.00",
    sale: NumberInt("100")
} ]);
db.getCollection("productSku").insert([ {
    _id: "64549308692",
    productId: "2",
    price: "498.00",
    sp: {
        "类型": "498型万事如意海鲜大礼包"
    },
    promotionPrice: "470.00",
    sale: NumberInt("100")
} ]);
db.getCollection("productSku").insert([ {
    _id: "4683565",
    productId: "3",
    price: "34.9",
    sp: {
        "质量": "800g",
        "类型": "鸡腿肉丁"
    },
    promotionPrice: "",
    sale: NumberInt("100")
} ]);
db.getCollection("productSku").insert([ {
    _id: "100005368902",
    productId: "26",
    price: "11.9",
    sp: {
        "品牌": "光明新鲜牧场",
        "净含量": "950ml"
    },
    promotionPrice: "",
    sale: NumberInt("100")
} ]);

// ----------------------------
// Collection structure for purchaseOrder
// ----------------------------
db.getCollection("purchaseOrder").drop();
db.createCollection("purchaseOrder");

// ----------------------------
// Documents of purchaseOrder
// ----------------------------
db.getCollection("purchaseOrder").insert([ {
    _id: ObjectId("5ff03df80e3a508e69ba1bc5"),
    supplierId: "1",
    purchaseOrderSpend: 2000,
    purchaseOrderDate: "2021-01-02 17:33:44",
    status: "0",
    purchaseDetail: [
        "1",
        "2"
    ]
} ]);
db.getCollection("purchaseOrder").insert([ {
    _id: ObjectId("5ff03df80e3a508e69ba1bc6"),
    supplierId: "2",
    purchaseOrderSpend: 1200,
    purchaseOrderDate: "2021-01-02 17:33:44",
    status: "0",
    purchaseDetail: [
        "3"
    ]
} ]);

// ----------------------------
// Collection structure for userInfo
// ----------------------------
db.getCollection("userInfo").drop();
db.createCollection("userInfo");

// ----------------------------
// Documents of userInfo
// ----------------------------
db.getCollection("userInfo").insert([ {
    _id: ObjectId("5fefff260e3a508e69ba1bbf"),
    userName: "Horatio",
    userPassword: "Horatio",
    userTel: "15131179023",
    userEmail: "XlgXlScGV@189.com",
    userAddress: {
        add1: "231 Lunetta Street",
        add2: "1050 Garfield Road",
        add3: "4242 Woodland Drive",
        add4: "2586 Argonne Street"
    },
    userComment: [
        "1",
        "2"
    ]
} ]);

// ----------------------------
// Collection structure for userOrder
// ----------------------------
db.getCollection("userOrder").drop();
db.createCollection("userOrder");

// ----------------------------
// Documents of userOrder
// ----------------------------
db.getCollection("userOrder").insert([ {
    _id: ObjectId("5ff03e300e3a508e69ba1bc7"),
    userId: "5fefff260e3a508e69ba1bbf",
    userOrderSpend: 2000,
    userOrderDate: "2021-01-02 17:34:40",
    method: "0",
    status: "0",
    note: "分30天送货",
    userOrderDetail: [
        "1",
        "2"
    ]
} ]);
db.getCollection("userOrder").insert([ {
    _id: ObjectId("5ff03e300e3a508e69ba1bc8"),
    userId: "5fefff260e3a508e69ba1bc0",
    userOrderSpend: 1200,
    userOrderDate: "2021-01-02 17:34:40",
    method: "0",
    status: "0",
    note: "分30天送货",
    userOrderDetail: [
        "3"
    ]
} ]);
