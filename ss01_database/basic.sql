create database QL_Furama;

use QL_Furama;

create table vi_tri(
	ma_vi_tri int primary key,
    ten_vi_tri varchar(45)
);

create table trinh_do(
	ma_trinh_do int primary key,
    ten_trinh_do varchar(45)
);

create table bo_phan(
	ma_bo_phan int primary key,
    ten_bo_phan varchar(45)
);

create table nhan_vien(
	ma_nhan_vien int primary key,
    ho_ten varchar(45),
    ngay_sinh date,
    so_cmnd varchar(45),
    luong double,
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    ma_vi_tri int,
    constraint fk_vitri_nhanvien foreign key (ma_vi_tri) REFERENCES vi_tri(ma_vi_tri),
	ma_trinh_do int,
    constraint fk_trinhdo_nhanvien foreign key (ma_trinh_do) REFERENCES trinh_do(ma_trinh_do),
    ma_bo_phan int,
    constraint fk_bophan_nhanvien foreign key (ma_bo_phan) REFERENCES bo_phan(ma_bo_phan)
);

create table loai_khach(
	ma_loai_khach int primary key,
    ten_loai_khach varchar(45)
);

create table khach_hang(
	ma_khach_hang int primary key,
    ma_loai_khach int,
    constraint fk_loaikhach_khachhang foreign key (ma_loai_khach) references loai_khach(ma_loai_khach),
    ho_ten varchar(45),
    ngay_sinh date,
    gioi_tinh bit(1),
    so_cmnd varchar(45),
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45)
);

create table kieu_thue(
	ma_kieu_thue int primary key,
    ten_kieu_thue varchar(45)
);

create table loai_dich_vu(
	ma_loai_dich_vu int primary key,
    ten_loai_dich_vu varchar(45)
);

create table dich_vu(
	ma_dich_vu int primary key,
    ten_dich_vu varchar(45),
    dien_tich int,
    chi_phi_thue double,
    so_nguoi_toi_da int,
    ma_kieu_thue int,
    constraint fk_dichvu_kieuthue foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
    ma_loai_dich_vu int,
    constraint fk_dichvu_loaidichvu foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
    tieu_chuan_phong varchar(45),
    mo_ta_tien_nghi_khac varchar(45),
    dien_tich_ho_boi double,
    so_tang int
);

create table hop_dong(
	ma_hop_dong int primary key,
    ngay_lam_hop_dong datetime,
    ngay_ket_thuc datetime,
    tien_dat_coc double,
    ma_nhan_vien int,
    constraint fk_hopdong_nhanvien foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
    ma_khach_hang int,
	constraint fk_hopdong_khachhang foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
    ma_dich_vu int,
    constraint fk_hopdong_dichvu foreign key (ma_dich_vu) references dich_vu(ma_dich_vu)
);

create table dich_vu_di_kem(
	ma_dich_vu_di_kem int primary key,
    ten_dich_vu_di_kem varchar(45),
    gia double,
    don_vi varchar(10),
    trang_thai varchar(45)
);

create table hop_dong_chi_tiet(
	ma_hop_dong_chi_tiet int primary key,
    ma_hop_dong int,
    constraint fk_hopdongchitiet_hopdong foreign key (ma_hop_dong) references hop_dong(ma_hop_dong),
    ma_dich_vu_di_kem int,
    constraint fk_hopdongchitiet_dvdikem foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem),
    so_luong int
);

-- cau1 
insert into vi_tri values(1, "Quản lý");
insert into vi_tri values(2, "Nhân viên");

insert into trinh_do values(1, "Trung cấp");
insert into trinh_do values(2, "Cao đẳng");
insert into trinh_do values(3, "Đại học");
insert into trinh_do values(4, "Sau đại học");

insert into bo_phan values(1, "Sale-Marketing");
insert into bo_phan values(2, "Hành chính");
insert into bo_phan values(3, "Phục vụ");
insert into bo_phan values(4, "Quản lý");

insert into nhan_vien
values 
  (1,'Nguyễn Văn An','1970-11-07',456231786,10000000,0901234121,'annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1),
  (2,'Lê Văn Bình','1997-04-09',654231234,7000000,0934212314,'binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),
  (3,'Hồ Thị Yến','1995-12-12',999231723,14000000,0412352315,'thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),
  (4,'Võ Công Toản','1980-04-04',123231365,17000000,0374443232,'toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4),
  (5,'Nguyễn Bỉnh Phát','1999-12-09',454363232,6000000,0902341231,'phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1),
  (6,'Khúc Nguyễn An Nghi','2000-11-08',964542311,7000000,0978653213,'annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3),
  (7,'Nguyễn Hữu Hà','1993-01-01',534323231,8000000,0941234553,'nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2),
  (8,'Nguyễn Hà Đông','1989-09-03',234414123,9000000,0642123111,'donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4),
  (9,'Tòng Hoang','1982-09-03',256781231,6000000,0245144444,'hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4),
  (10,'Nguyễn Công Đạo','1994-01-08',755434343,8000000,0988767111,'nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2);

insert into loai_khach  
values 
  (1,'Diamond'),
  (2,'Platinium'),
  (3,'Gold'),
  (4,'Silver'),
  (5,'Member');
  
insert into khach_hang 
(ma_khach_hang,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach) 
values 
  (1,'Nguyễn Thị Hào','1970-11-07',0,643431213,0945423362,'thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5),
  (2,'Phạm Xuân Diệu','1992-08-08',1,865342123,0954333333,'xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3),
  (3,'Trương Đình Nghệ','1990-02-27',1,488645199,0373213122,'nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
  (4,'Dương Văn Quan','1981-07-08',1,543432111,0490039241,'duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1),
  (5,'Hoàng Trần Nhi Nhi','1995-12-09',0,795453345,0312345678,'nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4),
  (6,'Tôn Nữ Mộc Châu','2005-12-06',0,732434215,0988888844,'tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4),
  (7,'Nguyễn Mỹ Kim','1984-04-08',0,856453123,0912345698,'kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1),
  (8,'Nguyễn Thị Hào','1999-04-08',0,965656433,0763212345,'haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
  (9,'Trần Đại Danh','1994-07-01',1,432341235,0643343433,'danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
  (10,'Nguyễn Tâm Đắc','1989-07-01',1,344343432,0987654321,'dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);
  
INSERT INTO kieu_thue 
VALUES 
  (1,'year'),
  (2,'month'),
  (3,'day'),
  (4,'hour');
  
INSERT INTO loai_dich_vu 
VALUES 
  (1,'Villa'),
  (2,'House'),
  (3,'Room');
  
INSERT INTO dich_vu 
  (ma_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang,ma_kieu_thue,ma_loai_dich_vu) 
VALUES 
  (1,'Villa Beach Front',25000,10000000,10,'vip','Có hồ bơi','500','4',3,1),
  (2,'House Princess 01',14000,5000000,7,'vip','Có thêm bếp nướng',null,'3',2,2),
  (3,'Room Twin 01',5000,1000000,2,'normal','Có tivi',null,null,4,3),
  (4,'Villa No Beach Front',22000,9000000,8,'normal','Có hồ bơi','300','3',3,1),
  (5,'House Princess 02',10000,4000000,5,'normal','Có thêm bếp nướng',null,'2',3,2),
  (6,'Room Twin 02',3000,900000,2,'normal','Có tivi',null,null,4,3);
  
INSERT INTO dich_vu_di_kem 
VALUES 
  (1,'Karaoke',10000,'giờ','tiện nghi, hiện tại'),
  (2,'Thuê xe máy',10000,'chiếc','hỏng 1 xe'),
  (3,'Thuê xe đạp',20000,'chiếc','tốt'),
  (4,'Buffet buổi sáng',15000,'suất','đầy đủ đồ ăn, tráng miệng'),
  (5,'Buffet buổi trưa',90000,'suất','đầy đủ đồ ăn, tráng miệng'),
  (6,'Buffet buổi tối',16000,'suất','đầy đủ đồ ăn, tráng miệng');
  
INSERT INTO hop_dong 
VALUES 
  (1,'2020-12-08','2020-12-08',0,3,1,3),
  (2,'2020-07-14','2020-07-21',200000,7,3,1),
  (3,'2021-03-15','2021-03-17',50000,3,4,2),
  (4,'2021-01-14','2021-01-18',100000,7,5,5),
  (5,'2021-07-14','2021-07-15',0,7,2,6),
  (6,'2021-06-01','2021-06-03',0,7,7,6),
  (7,'2021-09-02','2021-09-05',100000,7,4,4),
  (8,'2021-06-17','2021-06-18',150000,3,4,1),
  (9,'2020-11-19','2020-11-19',0,3,4,3),
  (10,'2021-04-12','2021-04-14',0,10,3,5),
  (11,'2021-04-25','2021-04-25',0,2,2,1),
  (12,'2021-05-25','2021-05-27',0,7,10,1);
  
INSERT INTO hop_dong_chi_tiet 
  (ma_hop_dong_chi_tiet,so_luong,ma_hop_dong,ma_dich_vu_di_kem) 
VALUES 
  (1,5,2,4),
  (2,8,2,5),
  (3,15,2,6),
  (4,1,3,1),
  (5,11,3,2),
  (6,1,1,3),
  (7,2,1,2),
  (8,2,12,2);
  -- 2
select * from nhan_vien 
where SUBSTRING(ho_ten,1,1) = 'H' or SUBSTRING(ho_ten,1,1) = 'T' or SUBSTRING(ho_ten,1,1) = 'K' and  length(ho_ten) <= 15;
-- 3
select * from khach_hang 
where year(curdate())-year(ngay_sinh) >= 18 and  year(curdate())-year(ngay_sinh) <= 50 and dia_chi like "%Đà Nẵng%" or dia_chi like "%Quảng Trị%";
-- 4
select k.ma_khach_hang, ho_ten, count(h.ma_khach_hang) as so_lan_dat_phong from hop_dong h, khach_hang k
where h.ma_khach_hang = k.ma_khach_hang and ma_loai_khach = 1 
group by ma_khach_hang 
order by count(h.ma_khach_hang) asc;

-- 5
Select khach_hang.ma_khach_hang, khach_hang.ho_ten,
		loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, 
        dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, 
        hop_dong.ngay_ket_thuc , sum(dich_vu.chi_phi_thue + (hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia)) as tong
from 	khach_hang 
left join 	hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
left join 	loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join 	dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
left join 	hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join 	dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by 	khach_hang.ma_khach_hang;
 
-- 6 
select ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
from dich_vu d, loai_dich_vu l
where d.ma_loai_dich_vu = l.ma_loai_dich_vu and d.ma_dich_vu not in
(select ma_dich_vu
from hop_dong
where  month(ngay_lam_hop_dong)=3 or month(ngay_lam_hop_dong)= 2 or month(ngay_lam_hop_dong)= 1
);
-- 7
select ma_dich_vu, ten_dich_vu, dien_tich,so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
from dich_vu d, loai_dich_vu l
where d.ma_loai_dich_vu = l.ma_loai_dich_vu and d.ma_dich_vu in
(select ma_dich_vu
from hop_dong
where  year(ngay_lam_hop_dong)=2020) 
and d.ma_dich_vu not in
(select ma_dich_vu
from hop_dong
where  year(ngay_lam_hop_dong)=2021)
;
-- 8
select distinct ho_ten
from khach_hang ;
-- 
select  ho_ten
from khach_hang
group by ho_ten ;
--
-- 9
 select 	month(ngay_lam_hop_dong) as thang, 
			count(month(ngay_lam_hop_dong)) as so_luong_khach_hang
 from 		hop_dong
 where  
			year(ngay_lam_hop_dong) = 2021
 group by 
			month(ngay_lam_hop_dong)
 order by 
			month(ngay_lam_hop_dong);
-- 10
select 	hop_dong.ma_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc,
		sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem
from 	hop_dong
left join 	hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong 
group by 	hop_dong.ma_hop_dong ;
-- 11
select 	dich_vu_di_kem.ma_dich_vu_di_kem , ten_dich_vu_di_kem
from 	hop_dong 
inner join 	khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
inner join 	hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
inner join 	dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
where	khach_hang.ma_loai_khach = 1
		and khach_hang.dia_chi like '%Vinh' 
        or khach_hang.dia_chi like '%Quảng Ngãi';
 --  12 
 select 	hop_dong.ma_hop_dong, nhan_vien.ho_ten, khach_hang.ho_ten 
			, khach_hang.so_dien_thoai as sdt_khach_hang, hop_dong.ma_dich_vu
			, dich_vu.ten_dich_vu ,sum(hop_dong_chi_tiet.so_luong) as so_luong ,hop_dong.tien_dat_coc
 from 		hop_dong
 inner join 	khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
 inner join 	nhan_vien on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
 inner join 	dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
 left join 		hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
 where 		year(ngay_lam_hop_dong) = 2020 
			and month(ngay_lam_hop_dong) > 9 
			and month(ngay_lam_hop_dong) <= 12 
			and hop_dong.ma_hop_dong not in (
				select 	ma_hop_dong 
                from 	hop_dong 
				where 	year(ngay_lam_hop_dong) = 2021 
						and month(ngay_lam_hop_dong) >= 1 
                        and month(ngay_lam_hop_dong) <= 6  
                        )
 group by 	hop_dong.ma_hop_dong;
 -- 13
select 	dich_vu_di_kem.ma_dich_vu_di_kem , ten_dich_vu_di_kem
		, sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem
from 	hop_dong 
inner join 	hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
inner join 	dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by 	dich_vu_di_kem.ma_dich_vu_di_kem 
order by 	so_luong_dich_vu_di_kem desc ;

-- 14:

select * 
from	(
		select 	hop_dong.ma_hop_dong, loai_dich_vu.ten_loai_dich_vu
				, dich_vu_di_kem.ten_dich_vu_di_kem 
                , count(dich_vu_di_kem.ma_dich_vu_di_kem) as so_lan_su_dung
		from 	hop_dong 
		inner join 	dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
		inner join 	loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
		inner join 	hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
		inner join 	dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
		group by 	dich_vu_di_kem.ma_dich_vu_di_kem 
		) as hello

where 	so_lan_su_dung =1
order by 	ma_hop_dong;


-- 15
select 	nhan_vien.ma_nhan_vien, ho_ten, trinh_do.ten_trinh_do
		, bo_phan.ten_bo_phan, so_dien_thoai, dia_chi  
from 	nhan_vien 
inner join	(
			select  ma_nhan_vien, count(ma_nhan_vien) as so_hop_dong from hop_dong
			where 	year(ngay_lam_hop_dong) >= 2020 
					and year(ngay_lam_hop_dong) <= 2021
			group by ma_nhan_vien
            ) as hello
			on hello.ma_nhan_vien = nhan_vien.ma_nhan_vien
inner join 	trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do
inner join 	bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan
where 	hello.so_hop_dong <=3;
    
-- 16
delete 	from 	nhan_vien
where	(
		select 	ma_nhan_vien 
        from 	nhan_vien 
		where 	ma_nhan_vien not in	(
				select 	ma_nhan_vien 
                from 	hop_dong
				where 	year(ngay_lam_hop_dong) >=2019 
                and year(ngay_lam_hop_dong) <= 2021
				)
		);
-- 17
	update 	khach_hang
    set 	ma_loai_khach = 1
    where 	ma_khach_hang in (
					select 	khach_hang.ma_khach_hang 
                    from 	khach_hang
					inner join (
							select 	ma_khach_hang, sum(dich_vu.chi_phi_thue) as tong_thanh_toan 
                            from 	hop_dong
							inner join 	dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
							where 	year(ngay_ket_thuc) = 2021
							group by	 ma_khach_hang
                            ) as hello
					on hello.ma_khach_hang = khach_hang.ma_khach_hang
					where 	khach_hang.ma_loai_khach = 2 
							and hello.tong_thanh_toan >= 10000000
					);
-- 18: 
	delete 	from 	khach_hang
    where	ma_khach_hang = (
			select 	ma_khach_hang 
            from 	hop_dong 
			where 	year(ngay_ket_thuc) < 2021
			);
    
    --  19: 
    update 	dich_vu_di_kem
    set 	gia = gia*2
    where	ma_dich_vu_di_kem in(
					select 	hello.ma_dich_vu_di_kem 
                    from 	dich_vu_di_kem inner join	(
								select  hop_dong_chi_tiet.ma_dich_vu_di_kem 
										,sum(hop_dong_chi_tiet.so_luong) as so_lan
								from 	hop_dong
								inner join 	hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
								where 		year(hop_dong.ngay_ket_thuc) = 2020
								group by 	hop_dong_chi_tiet.ma_hop_dong_chi_tiet
                                )as hello
					on dich_vu_di_kem.ma_dich_vu_di_kem = hello.ma_dich_vu_di_kem
					where hello.so_lan >= 10
					);
    
    --  20: union all
    select 	ma_nhan_vien as id, ho_ten
			, email, so_dien_thoai, ngay_sinh, dia_chi  
	from 	nhan_vien 
    union all
    select 	ma_khach_hang, ho_ten, email
			, so_dien_thoai, ngay_sinh, dia_chi 
	from khach_hang
    
    



